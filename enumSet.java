import java.util.EnumSet;
class enumSet
{
    enum Size
    {
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }
    
    public static void main(String []args)
    {
        EnumSet<Size> sizes=EnumSet.allOf(Size.class);
        System.out.println(sizes);
        EnumSet<Size> sizes1=EnumSet.noneOf(Size.class);
        System.out.println(sizes1);
        EnumSet<Size> sizes2=EnumSet.range(Size.SMALL,Size.LARGE);
        System.out.println(sizes2);
        EnumSet<Size> sizes3=EnumSet.of(Size.SMALL,Size.LARGE);
        System.out.println(sizes3);
           
    }
}
