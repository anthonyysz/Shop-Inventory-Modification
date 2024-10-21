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
- On mainscreen.html on the product and part tables, I added a Buy Now button to the left of the Update and Remove buttons. I wrote code to use the buyPart and buyProduct functions when those buttons are pressed
## Task G:
- In Part.java and Product.java: added the minimum and maximum inventory entities, and added a validators to make sure that parts or products added are within the maximum or minimum inventory requirements
- Modified sample data to include maximum and minimum inventory for both parts and products
- Added places in InhousePartForm, OutsourcedPartForm, and ProductForm for maximum and minimum inventory to be added, also added indicators to make it easier to tell which box was which when filling out form
- Corrected title of success and failure pages
- Added validators for maximum products and maximum parts to enforce inventory is between maximum and minimum values
- Renamed the persistent storage file