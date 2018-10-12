public class minbst
{
    public static void main (String args[])
    {
        inserttree obj = new inserttree();
        int a[]={1,2,3,4,5,6,7};
        obj.inserttreefunc(a,0,a.length-1);

    }
}
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val =x;}
}
class inserttree
{
    public TreeNode inserttreefunc(int[] arr,int start,int end)
    {
        //System.out.println("works");
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        TreeNode n= new TreeNode(arr[mid]);
        System.out.println(arr[mid]);
        n.left= inserttreefunc(arr,start,mid-1);
        n.right=inserttreefunc(arr,mid+1,end);
        return n;
    }
}