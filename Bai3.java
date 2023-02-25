package chuabt;

import org.junit.Test;

public class Bai3 {
    /*
    3. Hãy viết một method nhận vào một số nguyên, sau đó liệt kê ra màn hình các cặp số mà có tổng bằng số này.
     */
    //Tên method: LietKeCapSo
    //kieu: void
    //Tham số: Number int.

    public void LietKeCapSo(int number)
    {
        for (int i = 0; i <= number/2; i++) {
            for (int j = i; j <= number; j++) {
                if(i+j == number)
                {
                    System.out.println(i + " - "+ j);
                }
            }
        }
    }

    @Test
    public void Test_LietKeCapSo()
    {
        LietKeCapSo(10);
    }
}
