'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 4 Assignment - Python Set Source Code
May 17, 2022'''

'''Description: Using Python, create a set with the following specifics:
mySet = set({100,200,300,400,500})

Using "mySet" print the set. Then add the following to the set:
150, 250, 350, 400.

Print again and compare the output. You should see that the 400 does not repeat, as duplicates are not permitted.

Remove 150, 250, and 350 from the set.'''

# Create the set based on the description above
mySet = set({100,200,300,400,500})

# Print the full set as described above
print(mySet)

# Add values to the set as described above
mySet.add(150)
mySet.add(250)
mySet.add(350)
mySet.add(400)

# Print the new set. The show that 400 is still in the set because duplicates are not permitted
print(mySet)

# Remove the three numbers from the set described above
mySet.remove(150)
mySet.remove(250)
mySet.remove(350)

# Print the set again. The show that the three numbers have been removed
print(mySet)