package com.hspedu.tankgame3;

import java.util.Random;
import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    Shot shot = null;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    //编写方法，让敌方坦克动起来
    @Override
    public void run() {
            while (true) {
                switch (getDirect()) {
                    case 0:
                        //让坦克保持一个方向走30步
                        for(int i = 0; i < 30 ; i++) {
                                moveUp();
                            //休眠50毫秒
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 1:
                        //让坦克保持一个方向走30步
                        for(int i = 0; i < 30 ; i++) {
                                moveRight();
                            //休眠50毫秒
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 2:
                        //让坦克保持一个方向走30步
                        for(int i = 0; i < 30 ; i++) {
                                moveDown();
                            //休眠50毫秒
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 3:
                        //让坦克保持一个方向走30步
                        for(int i = 0; i < 30 ; i++) {
                                moveLeft();
                            //休眠50毫秒
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                }
                //然后随机改变坦克方向 0 —— 3
                setDirect((int)(Math.random() * 4));
                if(isLive == false) {
                    break; //退出线程
                }

            }
    }
}
