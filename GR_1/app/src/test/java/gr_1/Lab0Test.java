package gr_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.Assert;
public class Lab0Test {
    //1
    @Test(dataProvider = "inputProvider")
	public void inputTest(int p1, int p3) {
		Assert.assertEquals(Lab0.num1(p1), p3);
	}

	@DataProvider
	public Object[][] inputProvider() {
		return new Object[][] { { 1500, 1 }, { 15000, 15 }, {999,0} };
	}

    //2 
    @Test(dataProvider = "inputProvider2")
	public void inputTest2(int p1, boolean p3) {
		Assert.assertEquals(Lab0.num2(p1), p3);
	}

	@DataProvider
	public Object[][] inputProvider2() {
		return new Object[][] { { 3, true }, { 2, false }};
    }

    //3
    @Test(dataProvider = "inputProvider3")
	public void inputTest1(int p1, int p3) {
		Assert.assertEquals(Lab0.num3(p1), p3);
	}

	@DataProvider
	public Object[][] inputProvider3() {
		return new Object[][] { { 3, 4 }, { -1, -3 }};
	}

    //4
    @Test(dataProvider = "inputProvider4")
	public void inputTest4(int p1, String p3) {
		Assert.assertEquals(Lab0.num4(p1), p3);
	}

	@DataProvider
	public Object[][] inputProvider4() {
		return new Object[][] { { 3, "Задовільно" }, { -1, "Error" }};
	}
    //5
    @Test(dataProvider = "inputProvider5")
	public void inputTest5(int p1, int p2, int p3) {
		Assert.assertEquals(Lab0.num5(p1,p2), p3);
	}

	@DataProvider
	public Object[][] inputProvider5() {
		return new Object[][] { { 10,3,8}, {12,3,10}};
	}
    //6
    @Test(dataProvider = "inputProvider6")
	public void inputTest6(int p1, int p2, int p3) {
		Assert.assertEquals(Lab0.num6(p1,p2), p3);
	}

	@DataProvider
	public Object[][] inputProvider6() {
		return new Object[][] { { 10,3,3}, {12,4,3 }};
	}
}
