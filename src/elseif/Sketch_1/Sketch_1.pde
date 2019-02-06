void setup(){
  size(400,400);
noFill();
int Size= 100;
for(int i = 0; i < 11; i++){
  if(i % 2==0){
    fill(255,0,0);
  }
  else{
    fill(255,255,255);
  }
ellipse(200,200,Size,Size);
Size-= 10;
}
}