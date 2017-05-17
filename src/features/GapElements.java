package features;

import org.openqa.selenium.By;

/**
 * Created by breddy on 09-05-2017.
 */
public class GapElements {
    static By Button= By.cssSelector(".modal--close-button");
    static By CloseButton=By.xpath("//button[@class='modal--close-button']");
    static By Modal_Close_Button =By.cssSelector(".modal--close-button");
    static By Men=By.xpath("//a[@href='/browse/subDivision.do?cid=5065&mlink=5058,12456145,visnav_M&clink=12456145']");
    static By Image=By.xpath("//img[@src='/Asset_Archive/GPWeb/content/0013/359/638/assets/vcn/041317_MEN_DP_US_EC_DESK_MOB_VCN_1_2x.jpg']");
    static By Image2=By.xpath("//img[@src='http://www2.assets-gap.com/webcontent/0013/250/942/cn13250942.jpg']");
    static By ModelProductName= By.xpath("//div[@id='moduleProductName']/a");
    static By ModelProductsize= By.xpath("//div[@id='quickLookSize1Swatches']/button[@id='size1Swatch_ql_0_3']");
    static By AddToBag=By.xpath("//button[@id='addToBag0']");
    static By CheckOutButton=By.xpath("//button[@id='checkoutButton']");
    static By Categories=By.xpath("//div[@id='mainContent']/div/div/div[1]/div/nav/h2[3]/span");
    static By JeanCategories=By.xpath("//div[@class='g-1-2 g-lg-1-3 g-xl-1-3 g-1280-1-4']");
    static By Jeans=By.xpath("//nav[@class='sidebar-navigation']/div[10]/a/span");
    static By Shirts=By.xpath(".//*[@id='mainContent']/div/div/div[1]/div/nav/div[19]/a/span");
    static By JeansModels=By.xpath("//div[@class='g-1-2 g-lg-1-3 g-xl-1-3 g-1280-1-4']/div/div[1]/div[3]/div/a/div");
    static By Bootfitjeans=By.xpath("//div[@class='g-1-2 g-lg-1-3 g-xl-1-3 g-1280-1-4']/div/div[1]/div[3]/div/a[@id='product806441002']/div");
    static By Quantity1=By.xpath("//div[@class='quantity quantity_size']/input[@id='quantity-1']");
    static By Quantity2=By.xpath("//div[@class='quantity quantity_size']/input[@id='quantity-2']");
    static By Quantity3=By.xpath("//div[@class='quantity quantity_size']/input[@id='quantity-3']");
    static By Quantity4=By.xpath("//div[@class='quantity quantity_size']/input[@id='quantity-4']");
    static By Quantity5=By.xpath("//div[@class='quantity quantity_size']/input[@id='quantity-5']");

}
