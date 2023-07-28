import java.util.List;

public class AvtomatHotDrink extends Avtomat{
    public AvtomatHotDrink(List<Product> product) {
        super(product);
    }
    public String twoName(){
        System.out.println("Name product ");
        String twoName = sc.next();
        return twoName;
    }

    public Integer twoVolume(){
        System.out.println("Volume drink ");
        Integer twoVolume = sc.nextInt();
        return twoVolume;
    }
    public Integer twoTemperatura(){
        System.out.println("Temperatura drink ");
        Integer twoTemperatura = sc.nextInt();
        return  twoTemperatura;
    }

    public Product GetProduct(String name, int volume, int temperatura){
        for (Product product : product) {
            if (!(product instanceof HotDrink)) {
                continue;
            }
            if (product.GetName().equals (name)) {
                if ((product.GetVolume() == volume) &&
                        ((HotDrink) product).GetTemperatura() == temperatura) {
                    return product;
                }
            }
        }
        throw new IllegalStateException("Product not found!");
    }
}