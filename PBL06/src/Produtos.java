public class Produtos {
    public static void produto(String[] args){
        Produto roupas = new Moletom();
        Produto roupas1 = new Camisetas();
        Produto boneco1 = new FunkoPop();
        Produto boneco02 = new ActionFigure();

}
public class Jogos extends Produtos {
    public static void jogos(String[] args){
        Produto jogo1 = new CallOfDuty();
        Produto jogo2 = new GodOfWar();
        Produto jogo3 = new TheWitcher();
        Produto jogo4 = new Fortnite();
        Produto plataforma5 = new Minecraft();
        Produto plataforma6 = new Diablo();
    }

    public class roupas extends Produtos {
        public static void jogos(String[] args){
            Produto jogo1 = new CallOfDuty();
            Produto jogo2 = new GodOfWar();
            Produto jogo3 = new TheWitcher();
            Produto jogo4 = new Fortnite();
            Produto plataforma5 = new Minecraft();
            Produto plataforma6 = new Diablo();
        }
}