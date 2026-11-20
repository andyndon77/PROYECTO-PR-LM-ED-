<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="html" encoding="UTF-8" indent="yes"/>

  <xsl:template match="/">
    <html>
      <head>
        <meta charset="UTF-8"/>
        <title>RANKING-TOP 10</title>
        <link rel="stylesheet" type="text/css" href="ranking_CSS.css"/>
      </head>
      <body>
        <h2>Ranking de Partidas</h2>
        <table border="1">
          <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Puntuación</th>
          </tr>
          <xsl:for-each select="ranking/partida">
            <tr>
              <td><xsl:value-of select="@id"/></td>
              <td><xsl:value-of select="nombre"/></td>
              <td><xsl:value-of select="puntuacion"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>