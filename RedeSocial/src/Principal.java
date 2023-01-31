public class Principal {
    public static void main(String[] args) {
        RedeSocial[] user = new RedeSocial[2];

        user[0] = new Facebook("Inatel@2022_F", 500);
        user[1] = new Twitter("Inatel@2022_T", 1000);

        user[0].postarFoto();
        Facebook user0 = (Facebook) user[0];
        user0.compartilhar();
        user0.fazStreaming();

        user[1].postarComentario();
        user[1].postarVideo();
        user[1].curtirPublicacao();

    }
}
