Feature: ShopinessApp

  @TC_01
  Scenario:
    Given Open Shopiness App
    Then The screen display Cart icon, Search icon, Bat dau ngay button and Menu footer

  @TC_02
  Scenario:
    Given Open Shopiness App
    When Click to Thuong Hieu
    Then The screen display 9 brand name

  @TC_03
  Scenario:
    Given Open Shopiness App
    When Click to Uu Dai
    And Click first product
    Then The screen display ImageDiscount, DescriptionDiscount, Button Mua ban

  @TC_04
  Scenario:
    Given Open Shopiness App
    When Click to Voucher
    And Click last voucher
    Then The screen display voucher image, voucher description, button Mua ngay, button cart icon

  @TC_05
  Scenario:
    Given Open Shopiness App
    When Click to Ca nhan
    Then The screen display ma uu dai, uu dai, voucher, thuong hieu

  @TC_06
  Scenario:
    Given Open Shopiness App
    When Click to Nap dien thoai
    Then The screen display 4 logo and 6 nominal value
      | Items  | Display  |
      | logos | 4        |
      | 20k   | 20.000đ  |
      | 50k   | 50.000đ  |
      | 100k  | 100.000đ |
      | 200k  | 200.000đ |
      | 300k  | 300.000đ |
      | 500k  | 500.000đ |