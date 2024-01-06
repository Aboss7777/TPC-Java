
vow=['a','e','i','o','u']
sentence=input("Enter sentence")
count=0
for i in sentence:
    if i in vow:
        count+=1
print(count)