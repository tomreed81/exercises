# Green Dot 2nd interview question
# Count the number of times a number occurs in an array

array = [1,2,3,4,1,2,3,4,1,2]

def output(message):
    print message

if __name__ == '__main__':
    output("Array : " + str(array))

    counts = {}

    for element in array:
        if counts.__contains__(element):
            counts[element] += 1
        else:
            counts[element] = 1

    output("Count : " + str(counts))
