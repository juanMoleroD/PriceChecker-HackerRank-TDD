There is a shop with old-style chas registers. Rather than scanning
items and pulling the price from a database, the price of each item is
typed in manually. This method sometimes leads to errors. Given a
list of items and their correct prices, compare the prices to those 
entered when each item was sold. Determine the number of errors
in selling prices.

Example
products =      ['eggs' ,'milk' ,'cheese']
productPrices = [2.89   , 3.29  , 5.79]
productSold =   ['eggs' ,'eggs' ,'cheese' ,'milk']
soldPrice =     [2.89   , 2.99  ,5.97     , 3.29]

The second sale of eggs has a wrong price, as does the sale of
cheese. There are 2 errors in pricing.


Function Description:
Complete the function priceCheck in the editor.

priceCheck has the following parameter(s):
    string products[n]: each products[i] is the name of an item for sale
    sting productPrices[n]: each productPrices[i] is the price of
  products[i]
    string productSold[m]: each productSold[j] is the name of a
  product sold
    float soldPrice[m]: each soldPrice[j] contains the sale price
  recorded for productSold[j].

Returns int: the number of sale prices that were entered incorrectly

NOTE: This would be nicer visually by using Doubles as opposed to Float
but in the spirit of the test I embraced float.