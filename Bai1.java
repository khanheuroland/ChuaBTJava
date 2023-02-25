package chuabt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai1 {
    /*
    Hãy kiê tra 2 số bất kỳ có ước chung > 1 hay không?
     */
    //Tên: CheckCoUocChung
    //Kieu: boolean (true|false)
    //Tham số: int number1, int number2

    public boolean CheckUocSoChung(int number1, int number2)
    {
        boolean kq=false;
        int minNumber = number1>number2? number2: number1; //Toán tử điều kiện;
        for (int i = 2; i <= minNumber; i++) {
            if(number1 % i == 0 && number2 % i == 0)
            {
                kq = true;
                break; //Dừng và thoát ra khỏi vòng lặp.
            }
        }
        return kq; //Kết quả thu được.
    }


    @Test
    public void Test_CheckUocSoChung_possitive()
    {
        //Arrange
        int number1 = 6;
        int number2 = 10;
        boolean expected = true;

        //Action
        boolean actual = CheckUocSoChung(number1, number2);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void Test_CheckUocSoChung_Negative()
    {
        int number1 = 5;
        int number2=7;
        boolean expected=false;

        boolean actual = CheckUocSoChung(number1, number2);

        assertEquals(expected, actual);

    }

}
