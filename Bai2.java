package chuabt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai2 {
    /*
     2. Hãy viết một method nhận vào một số nguyên, sau đó kiểm tra số này có phải là số nguyên tố không? Viet Test method
     */
    //Ten: CheckSoNguyenTo
    //Kieu: Boolean
    //THam so: int

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

    @Test
    public void Test_Check_SoNguyenTo_possitive()
    {
        //Arrange
        int number = 2;
        boolean expected = true;

        //Action
        boolean actual = this.CheckSoNguyenTo(number);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Test_CheckSoNguyenTo_Negative()
    {
        //Arrange
        int number = 6;
        boolean expected = false;

        //Action
        boolean actual = this.CheckSoNguyenTo(number);

        //Assert
        assertEquals(expected, actual);
    }
}
