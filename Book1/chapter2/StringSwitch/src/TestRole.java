public class TestRole {

    public int defineLevel(String role) {
        int level;
        switch (role) {
            case "guest":
                level = 0;
                break;
            case "client":
                level = 1;
                break;
            case "moderator":
                level = 2;
                break;
            case "admin":
                level = 3;
                break;
            default:
                throw new IllegalArgumentException("non - authentic role = " + role);
        }
        return level;
    }

    public int defineLevel2(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non - authentic role = " + role);
                yield -1;
            }
        };
    }

    public int defineLevel3(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non - authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }

    
}
