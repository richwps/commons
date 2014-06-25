bind process de.hsos.processname to hsos/proc1
bind process http test.de 80 /wps/WebProcessingService de.hsos.testprocess to hsos/proc2
out.test1 =  in.test2
var.test2 = 10
var.test3 = 'hallo welt'
out.test4 = var.foo
var.test5 = var.test4
bind process de.hsos.processname to hsos/proc3
bind process http test.de 80 /wps/WebProcessingService de.hsos.testprocess to hsos/proc4
execute hs/proc1
with
 in.test1 as IN1
store
 OUT1 as var.xyz
execute hs/proc2
with
in.testn as IN22S
var.testx as IN3
store
OUT1 as out.xyz
OUT2 as var.foo
OUT3 as var.foo

