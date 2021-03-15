package com.example.quizg2;

public class Questions {

    public String mQuestions[] = {
            "¿Qué Provincias comparten el bosque petrificado de Puyango?",
            "¿Ecuador está situado en?",
            "¿En la Amazonía qué grupos indígenas se hallan?",
            "¿El parque nacional Yasuní, en qué provincia está ubicado?",
            "¿A qué lugares del mundo preferentemente se trasladan nuestros emigrantes?",
            "¿En qué provincia se desarrolló la cultura Tolita?",
            "¿Por qué razón al grupo nativo de Santo Domingo de los Tsachilas se les llama los Colorados?",
            "La Región Sierra o Interandina del Ecuador está conformada por...",
            "La Defensa Civil es el organismo encargado de...",
            "¿Dónde se encuentra concentrada la mayor cantidad de la población Ecuatoriana?",
            "¿Qué origen tiene el Archipiélago de Colón?"

    };

    private String mChoices[][]={
            {"El Oro y Loja", "Zamora y Loja", "Azuay y el Oro", "Azuay y Loja" },
            {"Suroeste de América del Sur.", "Noreste de América del Sur.", "Sureste de América del Sur.", "Noroeste de América del Sur"},
            {"Huaorani", "Los Tsáchilas" ,"Los Saraguros", "Indígenas"},
            {"Morona Santiago", "Sucumbíos", "Orellana", "Napo"},
            {"España y Estados unidos", "Colombia y Francia", "Francia y Marruecos", "Venezuela y Chile"},
            {"Esmeraldas", "Manabí", "Los Ríos", "Guayas"},
            {"La vegetación es rojiza", "La tierra es de color rojo", "Se pintan el cabello de rojo", "El cielo tiene un tono rojizo"},
            {"Doce Provincias", "Cinco Provincias", "Quince Provincias", "Once Provincias"},
            {"Organizar el mantenimiento de vías", "Educar a los niños del país", "Organizar mantenimiento de hospitales", "Prevenir problemas ocasionados por desastres"},
            {"Guayaquil", "Cuenca", "Machala", "Quito"},
            {"Origen Volcánico", "Origen pétreo", "Origen mineral", "Origen natural"}

    };

    private String mCorrectAnswers[] = {"El Oro y Loja", "Noroeste de América del Sur", "Huaorani", "Orellana",
     "España y Estados unidos", "Esmeraldas", "Se pintan el cabello de rojo", "Once Provincias", "Prevenir problemas ocasionados por desastres",
     "Guayaquil", "Origen Volcánico"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2 (int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3 (int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4 (int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
