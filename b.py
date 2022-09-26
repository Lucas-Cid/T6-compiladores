f = open("pokemon.txt", "r")
out = ['{\"' + x.split('\t')[3] + '\":' + x.split('\t')[0] + '}' for x in f.readlines()]
# for i in out:
#     if len(i) < 4:
#         print(i)    

print(out)
