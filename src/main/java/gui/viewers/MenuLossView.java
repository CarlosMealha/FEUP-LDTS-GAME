package gui.viewers;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import gui.stages.Loss;

import java.io.IOException;

public class MenuLossView {
  private final Screen screen;
  private final TextGraphics graphics;
  private Loss l;
  
  public MenuLossView(GameView gui) {
    this.graphics = gui.getGraphics();
    this.screen = gui.getScreen();
  }
  
  public void draw() throws IOException {
    screen.clear();
    l.draw(graphics);
    screen.refresh();
  }
}
