package Assessment;

import java.sql.*;

public class Manager {
    private final Connection connection;

    public Manager(String dbURL, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(dbURL, user, @123unimailXD);
    }



    public void addCompetitorToDB(Competitor competitor) throws SQLException {
        String query = "INSERT INTO Competitors (ID, Name, Age, Level, Scores, Country) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, competitor.getCompetitorID());
            statement.setString(2, competitor.getCompetitorName());
            statement.setInt(4, competitor.getCompetitorAge());
            statement.setString(3, competitor.getLevel().name());
            statement.setString(6, convertScoresToString(competitor.getScores()));
            statement.setString(5, competitor.getCompetitorCountry());
            statement.executeUpdate();

        }
    }

    private String convertScoresToString(int[] scores) {
        StringBuilder sb = new StringBuilder();
        for (int score : scores) {
            sb.append(score).append(",");
        }
        return sb.toString().replaceAll(",$", "");
    }

    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
