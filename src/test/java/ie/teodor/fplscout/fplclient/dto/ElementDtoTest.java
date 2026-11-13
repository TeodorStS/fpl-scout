package ie.teodor.fplscout.fplclient.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;

class ElementDtoTest {

    @Test
    void parsesARealPlayer() {
        String json = """ 
        {"can_transact":true,"can_select":true,"chance_of_playing_next_round":null,"chance_of_playing_this_round":null,"code":466052,"cost_change_event":0,"cost_change_event_fall":0,"cost_change_start":4,"cost_change_start_fall":-4,"price_change_percent":"-58.1","price_change_hourly_rate":76,"price_change_projections":[{"offset":0,"projected_percent":"-57.9","likelihood":-3},{"offset":1,"projected_percent":"-56.6","likelihood":-3},{"offset":2,"projected_percent":"-55.2","likelihood":-3}],"price_change_locked_until":null,"price_change_calibrating":false,"dreamteam_count":2,"element_type":3,"ep_next":"2.5","ep_this":"2.5","event_points":9,"first_name":"Rayan","form":"2.5","id":399,"in_dreamteam":false,"news":"","news_added":null,"now_cost":79,"photo":"466052.jpg","points_per_game":"6.0","removed":false,"second_name":"Cherki","selected_by_percent":"33.5","special":false,"squad_number":null,"status":"a","team":15,"team_code":43,"total_points":54,"transfers_in":4551096,"transfers_in_event":53839,"transfers_out":2278905,"transfers_out_event":36437,"value_form":"0.3","value_season":"6.8","web_name":"Cherki","known_name":"","region":73,"team_join_date":"2025-06-10","birth_date":"2003-08-17","has_temporary_code":false,"opta_code":"p466052","minutes":562,"goals_scored":5,"assists":2,"clean_sheets":2,"goals_conceded":8,"own_goals":0,"penalties_saved":0,"penalties_missed":0,"yellow_cards":2,"red_cards":0,"saves":0,"bonus":9,"bps":234,"influence":"266.8","creativity":"331.7","threat":"217.0","ict_index":"81.5","clearances_blocks_interceptions":4,"recoveries":18,"tackles":4,"defensive_contribution":26,"starts":7,"expected_goals":"1.92","expected_assists":"1.86","expected_goal_involvements":"3.78","expected_goals_conceded":"7.58","corners_and_indirect_freekicks_order":1,"corners_and_indirect_freekicks_text":"","direct_freekicks_order":1,"direct_freekicks_text":"","penalties_order":null,"penalties_text":"","scout_risks":[],"scout_news_link":"","influence_rank":17,"influence_rank_type":5,"creativity_rank":7,"creativity_rank_type":7,"threat_rank":21,"threat_rank_type":12,"ict_index_rank":5,"ict_index_rank_type":3,"expected_goals_per_90":0.31,"saves_per_90":0.0,"expected_assists_per_90":0.3,"expected_goal_involvements_per_90":0.61,"expected_goals_conceded_per_90":1.21,"goals_conceded_per_90":1.28,"now_cost_rank":11,"now_cost_rank_type":8,"form_rank":159,"form_rank_type":72,"points_per_game_rank":16,"points_per_game_rank_type":4,"selected_rank":7,"selected_rank_type":3,"starts_per_90":1.12,"clean_sheets_per_90":0.32,"defensive_contribution_per_90":4.16}
        """;

        JsonMapper mapper = JsonMapper.builder().build();
        ElementDto player = mapper.readValue(json, ElementDto.class);

        assertThat(player.id()).isEqualTo(399);
        assertThat(player.webName()).isEqualTo("Cherki");
        assertThat(player.nowCost()).isEqualTo(79);
    }
}