# Triangle Challenge

**Tools required to run triangle challenge -> Java 5 or higher and Maven 3**

**Step to run the challenge -> Execute all the test cases added in TriangleTest.java**

_Design Decisions taken to solve the problem._

1. Class Triangle is created under the domain package. Triangle is a simple domain class which adhere to principal of Domain Driven Design (DDD).
2. Triangle is an immutable class. For this problem definition, making it immutable solves the purpose.
3. I have also included validation logic in the same domain. We could argue here to extract the logic in separate validator class. But I thought this validation logic is not common and only belongs to Triangle domain.
4. Validation is triggered from constructor. We could argue again to not validate from constructor, but I do not wish to construct the Triangle with invalid inputs.

_TriangleTest.java covers all the basic test scenarios needed to solve this challenge. Test cases follow BDD pattern and test cases names are descriptive.