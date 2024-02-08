import com.google.gson.*;

import java.lang.reflect.Type;

public class KartAdapter implements JsonDeserializer<Kart> {
    @Override
    public Kart deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String tipoKart = jsonObject.get("tipoKart").getAsString();
        Gson gson = new Gson();
        switch (tipoKart) {
            case "Base":
                return gson.fromJson(json, KartBase.class);
            case "Medio":
                return gson.fromJson(json, KartMedio.class);
            case "Avanzato":
                return gson.fromJson(json, KartAvanzato.class);
            default:
                throw new JsonParseException("Tipo di kart non valido: " + tipoKart);
        }
    }
}
