package com.yadong.pattern.behavioral.memento;

/**
 * 备忘录模式
 * 定义:保存某个对象的某个状态,以便于在适当的时候恢复对象
 * 特征:"后悔药"
 * 类型:行为型
 *
 * 适用场景:
 *      1.保存和恢复数据相关业务场景
 *      2.后悔的时候,即想恢复到之前的状态
 * 优点:
 *      1.为用户提供了一种可恢复的机制
 *      2.存档信息的封装
 * 缺点:
 *      1.资源占用
 */
public class TestMemento {

    /**
     * 学习的时候会记录自己的思路,然后会记下来,如果想修改,可以恢复到之前保存的状态
     */
    public static void test() {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("如影随行的设计模式A", "手记内容A", "手记图片A");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题:" + article.getTitle() + " 内容:" + article.getContent() + " 图片:" + article.getImgs() + " 暂存成功");
        System.out.println("手记完整信息:" + article);



        System.out.println("修改手记start");

        article.setTitle("如影随行的设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");

        System.out.println("修改手记end");

        System.out.println("手记完整信息:" + article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);


        article.setTitle("如影随行的设计模式C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");

        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);


        System.out.println("暂存回退end");
        System.out.println("手记完整信息:" + article);

    }
}
