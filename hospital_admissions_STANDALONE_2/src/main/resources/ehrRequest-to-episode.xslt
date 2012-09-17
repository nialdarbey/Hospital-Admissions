<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >


	<xsl:output method="xml" />

	<xsl:template match="/EhrRequest">

		<ep:Episode xmlns:ep="http://www.mule-health.com/HospitalInformation/">
			<patientId><xsl:value-of select="patientId/text()" /></patientId>
			<episodeId>EP123412341</episodeId>
			<startDate>2012-09-02T09:37:40.248-03:00</startDate>
			<minDurationDays>6</minDurationDays>
		</ep:Episode>

	</xsl:template>

</xsl:stylesheet>