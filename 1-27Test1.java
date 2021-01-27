package 测试;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
* 扑克牌的简单操作
*
* */
class Card{
    private char suit;
    private int num;

    public Card(char suit, int num) {
        this.suit = suit;
        this.num = num;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "["+this.suit+","+this.num+"]";
    }
}
class Caozuo{
    public static final char[]suits = {'♠','♦','♣','♥'};
    public List<Card> buyCard(){
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card card = new Card(suits[j],i);
                list.add(card);
            }
        }

        return list;
    }


    public void swap(List<Card> l1 ,int a,int b){
        Card tmp = l1.get(a);
        l1.set(a,l1.get(b));
        l1.set(b,tmp);

    }

    //洗牌
    public void shuffleCard(List<Card> l1){

        for (int i = l1.size()-1; i > 0 ; i--) {
            Random random = new Random();
            int a = random.nextInt(i);
            swap(l1,i,a);
        }
    }

    //发牌
    public void dealCard(List<List<Card>> hands,List<Card> l){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                hands.get(j).add(l.remove(0));         //hands得到内部成员handj，对handj进行增加牌，牌来自于买的牌l1，对l1进行取牌；
            }
        }
    }
}
public class Test1{
    public static void main(String[] args) {
        Caozuo caozuo = new Caozuo();
        List<Card> l1 = caozuo.buyCard();
        System.out.println("---------买牌--------------");
        System.out.println(l1);
        caozuo.shuffleCard(l1);
        System.out.println("----------洗牌----------------");
        System.out.println(l1);
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        List<List<Card>> hands = new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);
        caozuo.dealCard(hands,l1);
        System.out.println("----------发牌-------------");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

    }
}



































