package chuabt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai4 {
    /*
    4. Hãy viết một method nhận vào một số nguyên, hãy tính tổng các số nguyên tố nhỏ hơn số này. Viết Test method
     */

    public boolean CheckSoNguyenTo(int number)
    {
        boolean kq = true;
        //if(number<2) kq=false; //Cau truc dk
        kq= number<2? false : true; //Toan tu dk

        for (int i = 2; i <= number/2; i++) {
            if(number%i==0)
            {
                kq = false;
                break;
            }
        }
        return kq;
    }


    //Method: TongSNT
    //Kieu: int
    //Thamso: int number

    public int TongSNT(int number)
    {
        int tong=0;
        for (int i = 1; i <= number; i++) {
            boolean checkSNTi = CheckSoNguyenTo(i);
            if(checkSNTi)
            {
                tong+= i; //tong = tong + i;
            }
        }
        return  tong;
    }

    @Test
    public void Test_TongSNT()
    {
        //Arrange
        int number = 2;
        int expected = 2;//"2 + 3 + 5 + 7"

        //Action
        int actual = TongSNT(number);

        //Assert
        assertEquals(expected, actual);
    }

}
