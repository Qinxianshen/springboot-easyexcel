package com.qin.springbooteasyexcel.domain;

/* author:Qinzijing
*  date: 2019/12/2
*  description:书籍实体类
*/
public class Book {
    //书籍id
    private Integer bookId;
    //书籍编号
    private Integer bookNumber;
    //书籍名称
    private String bookName;
    //书籍作者
    private String bookAuthor;
    //书籍出版社
    private String bookPress;
    //书籍封皮大图
    private String bookImageBig;
    //书籍封皮缩略图
    private String bookImageSmall;
    //书籍一级分类
    private String bookClassifyOne;
    //书籍二级分类
    private String bookClassifyTwo;
    //书籍简介
    private String bookDesc;
    //书籍所在地址
    private String bookAddress;
    //书籍评分
    private Double bookGrade;
    //书籍数量
    private int bookSum;
    //书籍剩余
    private int bookResidue;
    //书籍借阅次数
    private int bookBorrowNum;
    //用户对书籍期望值
    private int bookHopeByUser;
    //书籍的状态
    private int bookState;

    public int getBookState() {
        return bookState;
    }

    public void setBookState(int bookState) {
        this.bookState = bookState;
    }

    public int getBookHopeByUser() {
        return bookHopeByUser;
    }

    public void setBookHopeByUser(int bookHopeByUser) {
        this.bookHopeByUser = bookHopeByUser;
    }

    public int getBookBorrowNum() {
        return bookBorrowNum;
    }

    public void setBookBorrowNum(int bookBorrowNum) {
        this.bookBorrowNum = bookBorrowNum;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }

    public String getBookImageBig() {
        return bookImageBig;
    }

    public void setBookImageBig(String bookImageBig) {
        this.bookImageBig = bookImageBig;
    }

    public String getBookImageSmall() {
        return bookImageSmall;
    }

    public void setBookImageSmall(String bookImageSmall) {
        this.bookImageSmall = bookImageSmall;
    }

    public String getBookClassifyOne() {
        return bookClassifyOne;
    }

    public void setBookClassifyOne(String bookClassifyOne) {
        this.bookClassifyOne = bookClassifyOne;
    }

    public String getBookClassifyTwo() {
        return bookClassifyTwo;
    }

    public void setBookClassifyTwo(String bookClassifyTwo) {
        this.bookClassifyTwo = bookClassifyTwo;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getBookAddress() {
        return bookAddress;
    }

    public void setBookAddress(String bookAddress) {
        this.bookAddress = bookAddress;
    }

    public Double getBookGrade() {
        return bookGrade;
    }

    public void setBookGrade(Double bookGrade) {
        this.bookGrade = bookGrade;
    }

    public int getBookSum() {
        return bookSum;
    }

    public void setBookSum(int bookSum) {
        this.bookSum = bookSum;
    }

    public int getBookResidue() {
        return bookResidue;
    }

    public void setBookResidue(int bookResidue) {
        this.bookResidue = bookResidue;
    }
}
