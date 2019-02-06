int x = 0;
  int fake = 300;
void setup(){
  size(600,600);
}
  void draw(){
  noFill();
  
  
  int Size = 100;
  
  for(int i = 0; i<40; i++){
    ellipse(x,200, Size, Size);
    Size-= 10;
    
    
  }
   Size = 100;
  for(int i = 0; i<40; i++){
    ellipse(fake,200, Size, Size);
    Size-= 10;
    
    
  }
  
  x+= 20;
  fake-= 20;
  
  
  
  
  
  
}