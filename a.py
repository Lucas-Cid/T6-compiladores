f = open("1.txt", "r")
out = ['out.append(\"'+ x + '\");' for x in f.readlines()]
# for i in out:
#     print(i)

print(out)
