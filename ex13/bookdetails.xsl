<?xml version="1.0" encoding="UTF-8"?>



<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

  
    <xsl:template match="/">
        <html>
            <head>
                <title>bookdetail.xsl</title>
            </head>
            <body>
                <h2>Book Galary</h2>
                <table border='1'>
                    <tr>
                        <th>title</th> 
                        <th>authour</th>
                        <th>genre</th>
                        <th>price</th>
                    </tr>
                           <xsl:for-each select="books/book">
                               <tr>
                                   <td> <xsl:value-of select='title'/></td>
                                   <td><xsl:value-of select='author'/></td>
                                                                      <xsl:choose>
<xsl:when test="genre='Mystery'">
<td bgcolor="#ff0000"><xsl:value-of
select="genre"/></td>
</xsl:when>
<xsl:otherwise>
<td><xsl:value-of
select="genre"/></td>
</xsl:otherwise>
</xsl:choose>
                                        
                                   <xsl:choose>
<xsl:when test="price > 25">
<td bgcolor="#ff0000"><xsl:value-of
select="price"/></td>
</xsl:when>
<xsl:otherwise>
<td><xsl:value-of
select="price"/></td>
</xsl:otherwise>
</xsl:choose>
                                  
                              
                                   
                               </tr>
                               
                           </xsl:for-each>
                 
                
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
