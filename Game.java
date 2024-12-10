public class Game{
  private int numberOfSnakes;
  private int numberOfLadders;

  private Queue<Player> players;
  private List<Snake> snakes;
  private List<Ladder> ladder;

  private Board board;
  private Dice dice;
  public Game(int numberOfLadders, int numberOfSnakes,int boardSize){
   this.numberOfSnakes=numberOfSnakes;
   this.numberOfLadders=numberOfLadders;
    this.Players=new ArrayDeque<>();
    snakes=new ArrayList<>(numberOfSnakes);
    ladders=new ArrayList<>(numberOfLadders);
    board=new Board(boardSize);
    dice=new Dice();
    initBoard();
    
  }
  
