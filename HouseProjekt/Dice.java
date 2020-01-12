public class Dice{
public int diceValue;
public int throwDice(){/** metoda e cila perdoret per gjenerimin e nje numri te rastesishem nga 1-6*/
diceValue=(int)(Math.random()*6)+1;
return diceValue;}
}