package id.rizmaulana.covid19.data.model.russia

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * gudun-ku 10/04/20.
 */
data class RussiaPerProvince(
    @Expose @SerializedName("fid")
    val fid: Int = 0,
    @Expose @SerializedName("kasusMeni")
    val deaths: Int = 0,
    @Expose @SerializedName("kasusPosi")
    val confirmed: Int = 0,
    @Expose @SerializedName("kasusSemb")
    val recovered: Int = 0,
    @Expose @SerializedName("kodeProvi")
    val provinceCode: Int = 0,
    @Expose @SerializedName("provinsi")
    val provinceName: String? = null
)