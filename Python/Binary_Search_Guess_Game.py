state_play=True;
while state_play :
    min =0
    max=100
    mid=(min+max)//2
    state_check=True;
    print("guess Number From 0 : 100")
    while state_check :
        print("if your Number Greater Than : "+str(mid)+"  Press G")
        print("if your Number Small Than : "+str(mid)+"  Press S")
        print("if your Number Equal : "+str(mid)+"  Press E")
        check=input()
        if check=='G'or check=='g':
            min=mid
            mid=(min+max)//2
        elif check=='S'or check=='s':
            max=mid
            mid=(min+max)//2
        elif check=='E'or check=='e':
            print("____________________________________")
            print('\nYour Number is  '+str(mid))
            print("____________________________________")
            state_check=False;
        else :
            print("You Enter Invalid Input please Read Game Again : ")
    check_play=input("if Want play Again  Press : Y if wan't play press any button " )
    if(check_play !='y' and check_play!='Y'):
        state_play=False
    
            
