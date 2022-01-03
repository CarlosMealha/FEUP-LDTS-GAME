import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Ship {
  
  private Position position;
  
  Ship(int x, int y){
    position = new Position(x,y);
  }
  
  public int getX() {
    return position.getX();
  }
  public int getY() {
    return position.getY();
  }
  public void setX(int x) {
    position.setX(x);
  }
  public void setY(int y) {
    position.setY(y);
  }
  
  public Position moveLeft() {return new Position(position.getX()-1, position.getY());
  }
  
  public Position moveRight() {
    return new Position(position.getX()+1, position.getY());
  }
  
  public Position Stand() {return position;}
  
  public void draw(Screen screen) {
    screen.setCharacter(position.getX(), position.getY(), TextCharacter.fromCharacter('X')[0]);
  }
  
  public void setPosition(Position position) {
    this.position = position;
  }
}
