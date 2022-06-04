Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda nutella aratir

  Given Kulanici amazon anasayfasinda
  Then  Kullanici nutella icin arama yapar
  And   Sonuclarin nutella icerdigini test eder
  And   Sayfayi kapatir

  Scenario: TC02 Kullanici amazonda java aratir
    Given Kulanici amazon anasayfasinda
    Then  Kullanici java icin arama yapar
    And   Sonuclarin java icerdigini test eder
    And   Sayfayi kapatir

  Scenario: TC03 Kullanici amazonda iphone aratir
    When Kulanici amazon anasayfasinda
    And  Kullanici iphone icin arama yapar
    Then Sonuclarin iphone icerdigini test eder
    And  Sayfayi kapatir
