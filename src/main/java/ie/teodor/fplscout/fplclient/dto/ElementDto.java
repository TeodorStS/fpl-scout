package ie.teodor.fplscout.fplclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)

public record ElementDto(
    int id,
        int code,
        String webName,
        int team,
        int elementType,
        int nowCost,
        String status,
        String news,
        Integer chanceOfPlayingNextRound,
        String selectedByPercent,
        String expectedGoals
)
{
    
}
