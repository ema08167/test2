<?php
$name[0]="田中";
$name[1]="高橋";
$name[2]="斉藤";
echo $name[0];
echo "<br>";
$name_2=array("田中","高橋","斉藤");
echo $name_2[0];
echo "<br>";
$z=array("x","y","z");
echo $z[0];
echo "<br>";
$a=array("x","y","z");
echo $a[1];
echo "<br>";
$b=array("x","y","z");
echo $b[2];
echo "<br>";
$abc=array(1,5,10);
echo $abc[0];
echo "<br>";
$def=array(1,5,10);
echo $def[1];
echo "<br>";
$hij=array("山田",10,7);
echo $hij[1];
echo "<br>";
$name_3=array("田中","高橋","斉藤");
$name_3[]="佐藤";
echo $name_3[3];
echo "<br>";
$name_4=array("田中","高橋","斉藤");
$name_4[0]="加藤";
echo $name_4[0];
echo "<br>";
$name_5=array("田中","高橋","斉藤");
unset($name_5[1]);
echo $name_5[1];
$name_5[1]="中村";
echo $name_5[1];
?>