bind process net.disy.wps.lkn.processes.SelectReportingArea to lkn/selreporting
bind process net.disy.wps.lkn.mpa.processes.MSRLD5selection to mpa/selmsrld5
bind process net.disy.wps.lkn.mpa.processes.SelectTopography to mpa/seltopo
bind process net.disy.wps.lkn.mpa.processes.Intersect to mpa/intersect
bind process net.disy.wps.lkn.mpa.processes.Characteristics to mpa/characteristic

var.area = "NF"

execute lkn/selreporting with
var.area as area
in.reportingareas as reportingareas
store
reportingarea as var.reportingAreasNF

var.area = "DI"

execute lkn/selreporting with
var.area as area
in.reportingareas as reportingareas
store
reportingarea as var.reportingAreasDI

execute mpa/selmsrld5 with
in.msrld5 as msrl-d5
in.assessmentYear as bewertungsjahr
store
relevantAlgea as var.relevantAlgea
relevantSeagras as var.relevantSeagras
relevantYears as var.relevantYears

execute mpa/seltopo with
in.topography as topography
var.relevantYears as relevantYears
store
relevantTopographies as var.relevantTopographies
relevantTopographyYears as var.relevantTopographyYears
existingTopographyYears as var.existingTopographyYears

execute mpa/intersect with
var.reportingAreasDI as reportingAreas
var.relevantTopographies as topography
var.relevantTopographyYears as relevantTopographyYears
store
intersections as var.intersectionTidelandsReportingAreasDI

execute mpa/intersect with
var.reportingAreasNF as reportingAreas
var.relevantTopographies as topography
var.relevantTopographyYears as relevantTopographyYears
store
intersections as var.intersectionTidelandsReportingAreasNF

execute mpa/characteristics with
var.relevantYears as relevantYears
var.existingTopographyYears as existingTopographyYears
var.intersectionTidelandsReportingAreasNF as intersectionTidelandsReportingAreasNF
var.intersectionTidelandsReportingAreasDI as intersectionTidelandsReportingAreasDI
var.relevantSeagras as relevantSeagras
var.relevantAlgea as relevantAlgea
var.reportingAreasNF as reportingAreasNF
var.reportingAreasDI as reportingAreasDI
store
mpbResultGml as out.mpbResultGml