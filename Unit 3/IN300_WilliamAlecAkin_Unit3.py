'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 3 Assignment - Python Source Code
May 17, 2022'''

'''Description: Write a Python 3 program that uses sublists with the data below.
Then loop through the lists/sublists and print the values.

locomotive1=steam
locomotive2=diesel
locomotive3=electric
locamotive4=coal
locomotive5=wood
common=commined engines'''

# Create the lists of lists (sublists) with values above
trains = [["locomotive1", "steam"], ["locomotive2", "diesel"], ["locomotive3", "electric"], ["locomotive4", "coal"], 
        ["locomotive5", "wood"], ["common", "commined engines"]]

# Print the output to match the description
for i in range(len(trains)):
    print(trains[i][0] + "=" + trains[i][1])
