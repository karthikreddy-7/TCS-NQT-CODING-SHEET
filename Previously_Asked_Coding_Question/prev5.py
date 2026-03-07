maze=[
    [0,0,0,0],
    [0,1,0,1],
    [0,0,0,0],
    [0,0,0,0]
]

m=4
n=4

def final_path(x,y):
    if x>=m or y>=n or maze[x][y]==1:
        return 0
    if x==m-1 and y==n-1 :
        return 1
    return final_path(x+1,y)+final_path(x,y+1)

print(final_path(0,0))