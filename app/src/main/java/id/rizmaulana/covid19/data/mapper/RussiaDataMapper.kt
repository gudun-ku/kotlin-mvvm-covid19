package id.rizmaulana.covid19.data.mapper

import id.rizmaulana.covid19.R
import id.rizmaulana.covid19.data.model.russia.RussiaDaily
import id.rizmaulana.covid19.data.model.russia.RussiaPerProvince
import id.rizmaulana.covid19.ui.adapter.viewholders.PerCountryDailyGraphItem
import id.rizmaulana.covid19.ui.adapter.viewholders.PerCountryDailyItem
import id.rizmaulana.covid19.ui.adapter.viewholders.PerCountryProvinceGraphItem
import id.rizmaulana.covid19.ui.adapter.viewholders.PerCountryProvinceItem

/**
 * gudun-ku 10/04/20.
 */

object RussiaDailyDataMapper {

    fun transformToPerCountryDaily(responses: List<RussiaDaily>?) = responses?.map { response ->
        PerCountryDailyItem(
            response.fid,
            response.newCasePerDay,
            response.totalDeath,
            response.totalRecover,
            response.totalCase,
            response.date,
            response.days,
            R.string.indonesia_daily_info
        )
    }.orEmpty()

    fun transformIntoCountryDailyGraph(responses: List<RussiaDaily>?) = PerCountryDailyGraphItem(
        listData = transformToPerCountryDaily(responses.orEmpty())
    )

    fun transformIntoCountryProvince(responses: List<RussiaPerProvince>?) = responses?.map {
        PerCountryProvinceItem(
            it.provinceCode,
            it.provinceName.orEmpty(),
            it.confirmed,
            it.deaths,
            it.recovered
        )
    }.orEmpty()

    fun transformIntoCountryProvinceGraph(responses: List<RussiaPerProvince>?) =
        PerCountryProvinceGraphItem(
            listData = transformIntoCountryProvince(responses)
        )
}
