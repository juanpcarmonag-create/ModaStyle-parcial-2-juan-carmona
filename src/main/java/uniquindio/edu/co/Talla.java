package uniquindio.edu.co;

public enum Talla {
        XS(Tipo.ROPA),
        S(Tipo.ROPA),
        M(Tipo.ROPA),
        L(Tipo.ROPA),
        XL(Tipo.ROPA),

        TALLA_35(Tipo.CALZADO),
        TALLA_36(Tipo.CALZADO),
        TALLA_37(Tipo.CALZADO),
        TALLA_38(Tipo.CALZADO),
        TALLA_39(Tipo.CALZADO),
        TALLA_40(Tipo.CALZADO),
        TALLA_41(Tipo.CALZADO),
        TALLA_42(Tipo.CALZADO),
        TALLA_43(Tipo.CALZADO),
        TALLA_44(Tipo.CALZADO);

        public enum Tipo { ROPA, CALZADO }

        private final Tipo tipo;

        Talla(Tipo tipo) {
            this.tipo = tipo;
        }

        public Tipo getTipo() {
            return tipo;
        }
        private CategoriaPrendas categoriaPrendas;


    }

