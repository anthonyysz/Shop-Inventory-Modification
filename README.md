# Anthony's ALN2 Tasks C-J
## Task B:
- Deleted old README file that was unable to be edited
- Created this new one
## Task C:
- In src/main/resources/templates/mainscreen.html
  - Line 14: Changed page title to AMS Computer Shop
  - Lines 15-23: Added fullscreen class so that the div would take up the full width of the screen
  - Line 27: Changed div to fullscreen, changed background color and text color
  - Line 28: Centered the h1 text, changed the text to AMS Computers
  - Lines 30, 31, 39, 41, 62, 63, 76, 77: Added a .5% margin on the left side of the div so that text isn't so close to the left side of the screen
  - Lines 41 and 77: Changed text color to match the rest of the page, changed the width of the table to be 99% of the page, creating a .5% margin on the right side of the tables
  - Lines 39, 40, and 76: Made the buttons medium-sized instead of small
  - Line 30: Changed 'Parts' to 'Computer Parts'
  - Lines 62: Changed 'Products' to 'Computers'
## Task D:
- Created about.html with everything it contains
- Added at line 28 of mainscreen.html an About button to direct the webpage to the about page
- In MainScreenControllerr.java at line 55: added @GetMapping("/about) to have code that will direct the webpage to the about page
## Task E:
- Changed name of Data Source URL in application.properties to something personalized
- Starting at line 46 in BootStrapData.java: added products to inhousePartRepository and oursourcedPartRepository
- Below where parts were added: added 6 products to productRepository
## Task F:
- Added failure.html, failurePro.html, success.html, and successPro.html for success and failure pages when using the Buy now button
- At line 67 of AddPartController.java and line 176 of AddProductController.java (the bottom of each of those pages), I added the functions for the buy now buttons
- On mainscreen.html: On lines 58 and 95, I added buttons to buyNow for the Parts and Products
- I wrote code to use the buyProduct function when that button is pressed on line 177 of AddProductController
- I wrote code to use the buyPart function when that button is pressed on line 68 of AddPartController
## Task G:
- In Part.java: Added min and max inventory fields on line 33-34, imported and implemented MaxPartsValidator on lines 4 and 31, Changed the constructor to include maxInv and minInv lines 50-57, and added setters and getters for those 2 on lines 92-99
- In Product.java: Added min and max inventory fields on line 33-34, imported and implemented MaxProductValidator on lines 4 and 31, Changed the constructor to include maxInv and minInv lines 54-60, and added setters and getters for those 2 on lines 95-106
- Modified sample data to include maximum and minimum inventory for both parts and products in all of BootStrapData.java
- Added places in InhousePartForm (Lines 16, 18, 19, 21, 22, 24-28), OutsourcedPartForm (17, 19, 20, 22, 23, 25-27), and ProductForm (15, 17, 19, 21, 23-25) for maximum and minimum inventory to be added, also added indicators to make it easier to tell which box was which when filling out form
- Corrected title of success and failure pages (Line 6 in all)
- Created validators for maximum products and maximum parts to enforce inventory is between maximum and minimum values
- Renamed the persistent storage file (application.properties line 6)
## Assorted Corrections:
- Removed maximum product validator from Product.java (L4, 31)
- Removed buy now button from parts on mainscreen (Line 58), removed buy part function from AddPartController (L68-89)
- Created minimum parts validator and added to Part.java (Line 5, 26)
- Properly modified the code of MaxPartsValidator (L 17, 27, 30) and added MinimumPartsValidatorto enforce the inventory is between the maximum and minimum values
- Modified Code of InhousePartForm (L 28) and OutsourcedPartForm (L 26) to properly display error messages
- Deleted code from productForm for maximum and minimum fields (L 23)
- Deleted Success and Failure html pages for the incorrect part buy now button
- Removed maximum and minimum inventory fields from Product.java (L 54-62, 95-106)
## Task H:
- Changed code in InhousePartForm (L 28) and OutsourcedPartForm (L 26) to print global error messages in the same spot right above the submit button
- The code change above resulted in properly displayed error messages for both inventories that were above the maximum or below the minimum
- Changed ValidMaxParts (L 17) to make sure that it was checking for a TYPE instead of a FIELD, made sure ValidMinParts was the same way (L 17)
- Edited EnufPartsValidator (L36-39) to make sure that when adding more products, the remaining associated parts would be above their minimum
- Changed some display messages to accurately reflect their errors: ValidEnufParts L20, ValidMaxParts L20, ValidMinParts L20
## Task I:
- At Line 160 of PartTest: Added 2 tests for each minimum inventory and maximum inventory since there were none beforehand
## Task J:
- Deleted unused DeletePartsValidator class to clean code
## Task K:
- Cleaned up and added necessary comments for professional communication where I wrote code