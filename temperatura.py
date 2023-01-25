from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

browser = webdriver.Chrome()
browser.get('https://weather.com/pt-BR/clima/hoje/l/cd456e246b710e10cd019303ee89dd7486d87c3f89d1b01b0c96e0929fe4b296')

all_span = browser.find_elements(By.XPATH, "//h2 [contains( text(), \"Previsão diária\")]/ancestor::section//span [contains( text(), \"Probabilidade de chuva\")]/..")

for s in all_span:
    print(f":{s.text}")
 
browser.quit()
