// package main.battleship.gui.Controller.draw;

// import main.battleship.gui.Controller.Draw;
// import processing.core.PGraphics;
// import processing.core.PImage;

// public class Animation implements Art {
//   int x,y;
//   PImage[] frames;
//   boolean repeating;
//   int currentFrame = 0;
//   public Animation(int x, int y, PImage[] frames, boolean repeating){
//     this.x = x;
//     this.y = y;
//     this.frames = frames;
//     this.repeating = repeating;
//   }
//   public Animation(int  x, int y, PImage[] frames, int runTime ,boolean repeating){
//     this.x = x;
//     this.y = y;
//     this.frames = new PImage[runTime];
//     for (int i = 0; i < frames.length; i++) {
//       this.frames[i] = frames[Math.max(Math.min(((frames.length-1)/runTime)*i,frames.length-1),0)];
//     }
//     this.repeating = repeating;
//   }
//   @Override
//   public void draw(PGraphics g) {
//     g.image(frames[currentFrame],x,y);
//     currentFrame++;
//     if(currentFrame >= frames.length && repeating){
//       currentFrame %= frames.length;
//     }else if(currentFrame >= frames.length){
//       Draw.getDraw().removeItem(this);
//     }
//   }
//   @Override
//   public void setPossition(int x, int y) {
//     this.x = x;
//     this.y = y;
//   }
  
// }
