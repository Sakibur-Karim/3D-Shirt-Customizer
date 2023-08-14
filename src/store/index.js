import { proxy } from 'valtio'

const state = proxy({
    intro: true,
    color: '#ff0066',
    color1: '#ddff53',
    isLogoTexture: true,
    isFullTexture: false,
    logoDecal: './threejs.png',
    fullDecal: './threejs.png'
})

export default state