if in.blabla size 10
 	var.xyz = 20
 	var.sad = "test"
 	out.xyc = in.blabla
 	out.asd = var.lala 
 	execute hs/proc1
	with
 	in.test1 as IN1
	store
 	OUT1 as var.xyz
 	var.blabla = 10
 else
 	var.out="Nei"
 	execute hs/proc1
	with
 	in.test1 as IN1
	store
 	OUT1 as var.xyz
 	var.blabla = 10
 end

if in.blabla size 10
 	var.xyz = 20
 	var.sad = "test"
 	out.xyc = in.blabla
 	out.asd = var.lala 
 	execute hs/proc1
	with
 	in.test1 as IN1
	store
 	OUT1 as var.xyz
 	var.blabla = 10
 else
 	var.out="Nei"
 end
 
 if in.blabla size 10
 	var.xyz = 20
 	var.sad = "test"
 	out.xyc = in.blabla
 	out.asd = var.lala 
 	execute hs/proc1
	with
 	in.test1 as IN1
	store
 	OUT1 as var.xyz
 	var.blabla = 10 	
end

out.test =  in.test2
var.test = 10
out.test = var.test